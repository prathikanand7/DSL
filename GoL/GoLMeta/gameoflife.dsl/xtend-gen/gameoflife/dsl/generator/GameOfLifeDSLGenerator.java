package gameoflife.dsl.generator;

import gameoflife.dsl.gameOfLifeDSL.BirthRule;
import gameoflife.dsl.gameOfLifeDSL.Cell;
import gameoflife.dsl.gameOfLifeDSL.Grid;
import gameoflife.dsl.gameOfLifeDSL.Model;
import gameoflife.dsl.gameOfLifeDSL.NeighborCondition;
import gameoflife.dsl.gameOfLifeDSL.Range;
import gameoflife.dsl.gameOfLifeDSL.Rules;
import gameoflife.dsl.gameOfLifeDSL.SurviveRule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class GameOfLifeDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    URI _uRI = resource.getURI();
    String _plus = ("Generator called for: " + _uRI);
    InputOutput.<String>println(_plus);
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    final Model model = ((Model) _head);
    if ((model != null)) {
      fsa.generateFile("GameOfLife/RulesOfLife.java", this.generateRulesOfLife(model));
      InputOutput.<String>println("File generated successfully!");
    } else {
      InputOutput.<String>println("Model is null!");
    }
  }

  public CharSequence generateRulesOfLife(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package GameOfLife;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class RulesOfLife {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int i = 1; i < gameBoard.length - 1; i++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int j = 1; j < gameBoard[0].length - 1; j++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("int surrounding = countLiveNeighbors(gameBoard, i, j);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("boolean isAlive = gameBoard[i][j];");
    _builder.newLine();
    _builder.append("                ");
    _builder.newLine();
    {
      boolean _isEmpty = model.getRules().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("                ");
        final Rules rules = model.getRules().get(0);
        _builder.newLineIfNotEmpty();
        _builder.append("                ");
        _builder.append("// Survival rules");
        _builder.newLine();
        {
          EList<SurviveRule> _surviveRules = rules.getSurviveRules();
          for(final SurviveRule surviveRule : _surviveRules) {
            _builder.append("                ");
            _builder.append("if (isAlive && ");
            CharSequence _generateCondition = this.generateCondition(surviveRule.getNeighbors(), "surrounding");
            _builder.append(_generateCondition, "                ");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("                ");
            _builder.append("    ");
            _builder.append("survivingCells.add(new Point(i-1, j-1));");
            _builder.newLine();
            _builder.append("                ");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("                ");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("// Birth rules  ");
        _builder.newLine();
        {
          EList<BirthRule> _birthRules = rules.getBirthRules();
          for(final BirthRule birthRule : _birthRules) {
            _builder.append("                ");
            _builder.append("if (!isAlive && ");
            CharSequence _generateCondition_1 = this.generateCondition(birthRule.getNeighbors(), "surrounding");
            _builder.append(_generateCondition_1, "                ");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("                ");
            _builder.append("    ");
            _builder.append("survivingCells.add(new Point(i-1, j-1));");
            _builder.newLine();
            _builder.append("                ");
            _builder.append("}");
            _builder.newLine();
          }
        }
      } else {
        _builder.append("                ");
        _builder.append("// Default Conway rules");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("if (isAlive && (surrounding == 2 || surrounding == 3)) {");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("    ");
        _builder.append("survivingCells.add(new Point(i-1, j-1));");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("} else if (!isAlive && surrounding == 3) {");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("    ");
        _builder.append("survivingCells.add(new Point(i-1, j-1));");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static int countLiveNeighbors(boolean[][] gameBoard, int x, int y) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("int count = 0;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (int i = -1; i <= 1; i++) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (int j = -1; j <= 1; j++) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (i == 0 && j == 0) continue;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (gameBoard[x + i][y + j]) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("count++;");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return count;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// Initial grid configuration");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static boolean[][] getInitialGrid() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("boolean[][] grid = new boolean[50][50]; // Default size");
    _builder.newLine();
    {
      EList<Grid> _grids = model.getGrids();
      for(final Grid gridConfig : _grids) {
        _builder.append("        ");
        _builder.append("// Grid: ");
        String _name = gridConfig.getName();
        _builder.append(_name, "        ");
        _builder.newLineIfNotEmpty();
        {
          EList<Cell> _liveCells = gridConfig.getLiveCells();
          for(final Cell cell : _liveCells) {
            _builder.append("        ");
            _builder.append("if (");
            int _x = cell.getX();
            _builder.append(_x, "        ");
            _builder.append(" < grid.length && ");
            int _y = cell.getY();
            _builder.append(_y, "        ");
            _builder.append(" < grid[0].length) {");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("grid[");
            int _x_1 = cell.getX();
            _builder.append(_x_1, "            ");
            _builder.append("][");
            int _y_1 = cell.getY();
            _builder.append(_y_1, "            ");
            _builder.append("] = true;");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("        ");
    _builder.append("return grid;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateCondition(final NeighborCondition condition, final String varName) {
    CharSequence _xifexpression = null;
    Range _range = condition.getRange();
    boolean _tripleNotEquals = (_range != null);
    if (_tripleNotEquals) {
      CharSequence _xblockexpression = null;
      {
        final Integer min = Integer.valueOf(condition.getRange().getMin());
        final Integer max = Integer.valueOf(condition.getRange().getMax());
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(varName);
        _builder.append(" >= ");
        _builder.append(min);
        _builder.append(" && ");
        _builder.append(varName);
        _builder.append(" <= ");
        _builder.append(max);
        _xblockexpression = _builder;
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xblockexpression_1 = null;
      {
        final Integer count = Integer.valueOf(condition.getCount());
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(varName);
        _builder.append(" == ");
        _builder.append(count);
        _xblockexpression_1 = _builder;
      }
      _xifexpression = _xblockexpression_1;
    }
    return _xifexpression;
  }
}
