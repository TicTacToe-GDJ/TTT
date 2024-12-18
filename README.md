# Tic Tac Toe Game - Object-Oriented Design

## Overview
This project is a Java-based implementation of the classic Tic Tac Toe game. It utilizes Object-Oriented Programming (OOP) principles to ensure a modular, maintainable, and extensible design. The game allows two players to play alternately until there is a winner or the game ends in a tie.

---

## Features
- Turn-based gameplay for two players.
- Input validation to ensure valid moves.
- Automatic win or tie detection after each turn.
- Modular and extensible design.

---

## Classes
The project is divided into the following classes:

### 1. **Player**
- **Purpose**: Represents a player in the game.
- **Responsibilities**:
  - Stores the player's symbol ("X" or "O").
  - Handles position selection and input validation.

### 2. **Board**
- **Purpose**: Manages the game board.
- **Responsibilities**:
  - Tracks the state of the board.
  - Validates moves.
  - Checks the game state (win, tie, or ongoing).

### 3. **Game**
- **Purpose**: Orchestrates the gameplay.
- **Responsibilities**:
  - Alternates turns between players.
  - Delegates tasks to the `Player` and `Board` classes.
  - Handles the game loop and declares results.

### 4. **TicTacToe**
- **Purpose**: Entry point of the application.
- **Responsibilities**:
  - Instantiates the game and starts the game loop.

---

## How to Run the Game
1. Clone this repository:
   ```bash
   git clone <repository_url>
   ```
2. Navigate to the project directory and compile the code:
   ```bash
   javac *.java
   ```
3. Run the program:
   ```bash
   java TicTacToe
   ```

---

## Example Gameplay
1. The board is displayed as a 3x3 grid with positions labeled from 1 to 9.
2. Players take turns to choose a position by entering a number between 1 and 9.
3. The board updates after each valid move.
4. The game ends when a player wins or all positions are filled, resulting in a tie.

---

## OOP Principles Applied
- **Single Responsibility Principle (SRP)**:
  - Each class has a clear and specific responsibility.
- **Open/Closed Principle (OCP)**:
  - The design is open for extension (e.g., adding AI players or custom board sizes) without modifying existing code.
- **Encapsulation**:
  - All class attributes are private, accessed only via public methods.
- **Modularity**:
  - The game logic is divided into independent, reusable components.

---

## Future Enhancements
- **AI Player**:
  - Implement an AI subclass for `Player` with strategic move selection.
- **Custom Board Sizes**:
  - Extend the `Board` class to support larger grids.
- **Online Multiplayer**:
  - Add networking capabilities for remote play.
- **Timer**:
  - Introduce a timer for each player's turn.

---

## License
This project is licensed under the MIT License. Feel free to use, modify, and distribute this code.

---

## Contributing
Contributions are welcome! If you find a bug or have a feature request, please open an issue or submit a pull request.
