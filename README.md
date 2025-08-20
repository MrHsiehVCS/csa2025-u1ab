# Unit 1ab Programming Project - Variables & Syntax

If you're seeing this, you have successfully loaded your first project!
This project is intended to be fairly easy. This project is a tutorial for the programming project workflow.

## Rules for All Programming Projects
- You may not edit the test files. Github keeps track of the edit history, so Mr. Hsieh will know. 

## General Guidelines for Programming Projects
- Projects are intended to be completed in order (e.g Part A, then Part B, etc.).
- Self-testing is very important. Don't just run the tests, run your actual code and see if it does what you want. 

## Part 0 - Setting up
You will need to do this at the beginning of each project. 
1. Install the java extensions
  - When you first open the code space, a box should show up on the bottom right that asks if you want to do this. Click `Continue` if it shows up. 
  - If it doesn't show up, you can manually install the extensions from the extensions marketplace
    1. click the symbol on the left that is 4 squares (one rotated). 
    2. In the bar that pops up, type in `java` and install the "Extension Pack for Java"
    3. make sure to enable it after you install it. 
2. Run your code once, to have the IDE recognize the test cases. 
  - At the top of any `main` method, you can click the "run" that shows up
  - If it isn't there, you can also press the play button on the top right.
    - if a box pops up on the top middle of your IDE, just pick `java`
3. Run the unit tests to see how many you are passing.
  1. Click the flask symbol on the left to open the testing view.
    - If the flask symbol is not there, run your code at least once. 
  2. Hover your mouse over any test, or group of tests, and click the play button that shows up

## Part A - Big Emoticon
Goal: Fix `BigEmoticon.java` to match the intended output that is shown in `BigEmoticonTest.java`
- This is mostly about syntax, and also tests your knowledge of `print` and `println`.

## Part B - Temperature Converter
Goal: Fix `TemperatureConverter.java` to match the intended output in `TemperatureConverterTest.java`
- This is about your knowledge of variables, and data types. Make sure things are the correct type, and use your math PEMDAS knowledge to make equations work as intended. 
- You will need to write the code for the 4th and 5th line from scratch. 
- If you just write a print statement that prints the answer, you will be docked points. You must create variables and a math equation, and then use that in the print statement, in a similar style to the ones already in the file. 

## Part C - Chatbot
Goal: Create a simple chatbox in `Chatbot.java` that responds the way we have specified in `ChatbotTest.java`
1. Create a `main` method in `chatbot.java`
  - Test that it works by putting an print statement and running it. 
2. Make the chatbot start by saying `Hi! What is your name?`
3. Create a scanner that takes in input and saves the input into a variable.
  - reference the code in our online textbook (CSAwesome) if you forgot how
    - don't forget to import the scanner
  - You can test this by printing out the variable after its filled
4. Make the chatbot say `Hello, {name}. I am a chatbot, but I don't have anything to say... Bye!`
  - the `{name}` should be replaced by the name given by the user
  - self-test this by running your `main` method to check it works
  - after self-testing, you can run the unit tests

## Grading Breakdown
- Code compiles & runs without errors: 2 pts
- Formatting/indentation: 2 points
- All code commented: 2 points
- ~~No public methods/attributes besides the ones specified: 0 point~~ (not applicable for this project)
- ~~All code is DRY (Don't repeat yourself): 0 points~~ (not applicable for this project)
- Test cases: 4 points (2 tests, 2 pts each)
Total: 10 points