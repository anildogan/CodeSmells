public class Game {
    private char _lastSymbol = ' ';
    private Board _board = new Board();

    public void Play(char symbol, int x, int y) throws Exception { //primitive obsession, data clumps
        if (_lastSymbol == ' ') {
            if (symbol == 'O') {
                throw new Exception("Invalid first player");
            }
        }
        else if (symbol == _lastSymbol) {
            throw new Exception("Invalid next player");
        }
        else if (_board.TileAt(x, y).Symbol != ' ') { //message chains
            throw new Exception("Invalid position");
        }

        _lastSymbol = symbol;
        _board.AddTileAt(symbol, x, y);
    }

    public char Winner() { //long method, primitive obsession
        if (_board.TileAt(0, 0).Symbol != ' ' &&
                _board.TileAt(0, 1).Symbol != ' ' &&
                _board.TileAt(0, 2).Symbol != ' ') {
            if (_board.TileAt(0, 0).Symbol ==
                    _board.TileAt(0, 1).Symbol && //message chains
                    _board.TileAt(0, 2).Symbol == _board.TileAt(0, 1).Symbol) {
                return _board.TileAt(0, 0).Symbol;
            }
        }

        if (_board.TileAt(1, 0).Symbol != ' ' && //message chains
                _board.TileAt(1, 1).Symbol != ' ' &&
                _board.TileAt(1, 2).Symbol != ' ') {
            if (_board.TileAt(1, 0).Symbol ==
                    _board.TileAt(1, 1).Symbol &&
                    _board.TileAt(1, 2).Symbol ==
                            _board.TileAt(1, 1).Symbol) {
                return _board.TileAt(1, 0).Symbol;
            }
        }

        if (_board.TileAt(2, 0).Symbol != ' ' && //message chains
                _board.TileAt(2, 1).Symbol != ' ' &&
                _board.TileAt(2, 2).Symbol != ' ') {
            if (_board.TileAt(2, 0).Symbol ==
                    _board.TileAt(2, 1).Symbol &&
                    _board.TileAt(2, 2).Symbol ==
                            _board.TileAt(2, 1).Symbol) {
                return _board.TileAt(2, 0).Symbol;
            }
        }

        return ' ';
    }
}

