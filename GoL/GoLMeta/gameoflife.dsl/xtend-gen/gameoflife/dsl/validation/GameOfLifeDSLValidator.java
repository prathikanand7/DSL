package gameoflife.dsl.validation;

import gameoflife.dsl.gameOfLifeDSL.Cell;
import gameoflife.dsl.gameOfLifeDSL.GameOfLifeDSLPackage;
import gameoflife.dsl.gameOfLifeDSL.Grid;
import gameoflife.dsl.gameOfLifeDSL.NeighborCondition;
import gameoflife.dsl.gameOfLifeDSL.Range;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class GameOfLifeDSLValidator extends AbstractGameOfLifeDSLValidator {
  public static final String INVALID_GRID_COORDINATES = "invalidGridCoordinates";

  public static final String INVALID_NEIGHBOR_COUNT = "invalidNeighborCount";

  public static final String DUPLICATE_CELL = "duplicateCell";

  @Check
  public Object checkCellCoordinates(final Cell cell) {
    Object _xtrycatchfinallyexpression = null;
    try {
      final Integer x = Integer.valueOf(cell.getX());
      final Integer y = Integer.valueOf(cell.getY());
      if ((((x).intValue() < 0) || ((x).intValue() >= 100))) {
        this.error("X coordinate must be between 0 and 99", 
          GameOfLifeDSLPackage.Literals.CELL__X, 
          GameOfLifeDSLValidator.INVALID_GRID_COORDINATES);
      }
      if ((((y).intValue() < 0) || ((y).intValue() >= 100))) {
        this.error("Y coordinate must be between 0 and 99", 
          GameOfLifeDSLPackage.Literals.CELL__Y, 
          GameOfLifeDSLValidator.INVALID_GRID_COORDINATES);
      }
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        _xtrycatchfinallyexpression = null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }

  @Check
  public Object checkNeighborCondition(final NeighborCondition condition) {
    Object _xifexpression = null;
    Range _range = condition.getRange();
    boolean _tripleNotEquals = (_range != null);
    if (_tripleNotEquals) {
      Object _xtrycatchfinallyexpression = null;
      try {
        final Integer min = Integer.valueOf(condition.getRange().getMin());
        final Integer max = Integer.valueOf(condition.getRange().getMax());
        if ((((min).intValue() < 0) || ((max).intValue() > 8))) {
          this.error("Neighbor count range must be between 0 and 8", 
            null, 
            GameOfLifeDSLValidator.INVALID_NEIGHBOR_COUNT);
        }
        boolean _greaterThan = (min.compareTo(max) > 0);
        if (_greaterThan) {
          this.error("Range minimum cannot be greater than maximum", 
            null, 
            GameOfLifeDSLValidator.INVALID_NEIGHBOR_COUNT);
        }
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          _xtrycatchfinallyexpression = null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xifexpression = _xtrycatchfinallyexpression;
    } else {
      Object _xtrycatchfinallyexpression_1 = null;
      try {
        final Integer count = Integer.valueOf(condition.getCount());
        if ((((count).intValue() < 0) || ((count).intValue() > 8))) {
          this.error("Neighbor count must be between 0 and 8", 
            null, 
            GameOfLifeDSLValidator.INVALID_NEIGHBOR_COUNT);
        }
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          _xtrycatchfinallyexpression_1 = null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xifexpression = _xtrycatchfinallyexpression_1;
    }
    return _xifexpression;
  }

  @Check
  public void checkDuplicateCells(final Grid grid) {
    final HashMap<String, Cell> seenCells = CollectionLiterals.<String, Cell>newHashMap();
    EList<Cell> _liveCells = grid.getLiveCells();
    for (final Cell cell : _liveCells) {
      {
        int _x = cell.getX();
        String _plus = (Integer.valueOf(_x) + ",");
        int _y = cell.getY();
        final String key = (_plus + Integer.valueOf(_y));
        boolean _containsKey = seenCells.containsKey(key);
        if (_containsKey) {
          int _x_1 = cell.getX();
          String _plus_1 = ("Duplicate cell at (" + Integer.valueOf(_x_1));
          String _plus_2 = (_plus_1 + ", ");
          int _y_1 = cell.getY();
          String _plus_3 = (_plus_2 + Integer.valueOf(_y_1));
          String _plus_4 = (_plus_3 + ")");
          this.error(_plus_4, 
            null, 
            GameOfLifeDSLValidator.DUPLICATE_CELL);
        } else {
          seenCells.put(key, cell);
        }
      }
    }
  }
}
