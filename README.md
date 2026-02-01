# Data Modelling

- A chessGame has Board
- A board has Cell
- A Cell has position on Board and may or may not be chesspiece
- Each piece has some common properties example : color,name,killed
- Each piece has to implement some method(chess piece interface)
- A piece can move in different direction therefore we create a list of strategies in which all direction a piece can move
- For example rook and queen both have same vertical and horizonal movement so instead of code duplication we use strategy pattern here
- it makes code more extendable
- if we want in our chess pawn behave like bishop then we need to only change pawn movemen strategy.
