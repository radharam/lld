package com.scaler.lld.ttt.modules;

import java.util.Objects;

public class Cell {
    private int row;
    private int col;
    private Symbol symbol;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public boolean isEmpty() {
        return Objects.isNull(symbol);
    }

    public void clearCell() {
        this.symbol = null;
    }
}
