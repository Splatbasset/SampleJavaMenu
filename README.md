# Sample Menu System

A simple console menu template in Java. It displays a numbered list of options, reads the user's choice, and runs the matching action until the user enters `0` to exit. Use it as a starting point for any menu-driven console program.

## Folder Structure

- `src/` – source files (`SampleMenu.java`)
- `lib/` – external dependencies (none required)
- `bin/` – compiled `.class` files (generated)

## Running the Program

**In VS Code:** open `SampleMenu.java` and click **Run** above `main`, or press `F5`.

**From the command line** (in the project root):

```bash
javac -d bin src/SampleMenu.java
java -cp bin SampleMenu
```

## Sample Output

```
Welcome to a Sample Menu System
--------------------------------
Press 1 for Option 1
Press 2 for Option 2
Press 3 for Option 3
Press 0 to Exit
```

Entering a number runs that option; entering `0` prints a goodbye message and exits. Non-numeric input prompts the user to enter a number.

## How It Works

| Method | Purpose |
|---|---|
| `main` | Loops until the user enters `0`: shows the menu, reads input with a `Scanner`, and passes it to `processInput`. |
| `printMenu` | Prints the menu options to the console. |
| `processInput` | Uses a `switch` to run the action for the chosen option. |

## Customizing the Menu

1. **Add a menu line** in `printMenu()`, e.g. `System.out.println("Press 4 for Option 4");`. Use numbers only for option keys.
2. **Add a matching `case`** in `processInput()`:
   ```java
   case 4:
       optionFour();
       break;
   ```
3. **Write the method** that does the work, and replace the placeholder `System.out.println` calls in the existing cases with calls to your own methods.

Keep `0` as the exit option, since the loop in `main` stops on `0`.
