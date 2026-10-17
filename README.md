
# ✈️ SpiceJet Calendar Automation using Selenium WebDriver

## 📌 Project Overview

This project demonstrates web UI automation of the flight booking calendar on the SpiceJet website using **Java, Selenium WebDriver, and JDK 25**.

The main focus is to practice Selenium fundamentals, dynamic XPath locators, explicit waits, Java date handling, and calendar element identification.

## 🛠️ Tech Stack

- **Language:** Java
- **JDK:** JDK 25
- **Automation Tool:** Selenium WebDriver
- **Browser:** Google Chrome
- **Wait Strategy:** WebDriverWait and ExpectedConditions
- **Date Handling:** Java LocalDate API
- **IDE:** Eclipse IDE

## 🎯 Key Features

- Launches the SpiceJet website using Selenium WebDriver.
- Interacts with the From and To airport input fields.
- Identifies calendar elements using XPath locators.
- Handles SVG-based elements using XPath's `local-name()` function.
- Uses explicit waits to synchronize browser interactions.
- Calculates a future date dynamically using Java's `LocalDate` API.
- Identifies the target calendar month and year dynamically.
- Locates and selects the target day using a relative XPath.

## 💻 Java Concepts Practiced

### 1. Simplified Main Method

Explores the simplified `void main()` entry point supported by modern Java, including JDK 25, instead of the traditional `public static void main(String[] args)` declaration.

### 2. LocalDate API

Uses Java's date and time API to calculate a future date and retrieve its month, year, and day.

### 3. Dynamic XPath

Builds XPath expressions using runtime values to identify calendar elements based on the target month and year.

### 4. Explicit Waits

Uses `WebDriverWait` and `ExpectedConditions` to wait for elements to become available before interacting with them.

## 🚀 Getting Started

### Prerequisites

Make sure you have installed:

- JDK 25
- Eclipse IDE or another Java IDE
- Google Chrome
- Selenium WebDriver dependencies

### Setup Instructions

1. Clone or download this repository.
2. Import the project into your Java IDE.
3. Configure the JDK as Java 25.
4. Add Selenium WebDriver dependencies to the project.
5. Verify that your Chrome browser and Selenium-compatible driver setup are working.
6. Run the `SpiceJetCalenderAutomation` class.

## 📂 Project Structure

```text
SpiceJet-Calendar-Automation/
├── src/
│   └── com/
│       └── spicejet/
│           └── SpiceJetCalenderAutomation.java
├── README.md
└── pom.xml (if using Maven)
```

*Note: The project structure may vary depending on your IDE and build configuration.*

## 📚 Learning Outcomes

Through this project, I practiced:

- Writing Selenium automation scripts in Java.
- Creating dynamic and relative XPath locators.
- Interacting with SVG elements.
- Synchronizing browser actions using explicit waits.
- Working with dynamic calendar dates.
- Exploring modern Java syntax and features.

## 🔮 Future Improvements

- Add logic to navigate through multiple calendar months dynamically.
- Validate From and To airport selections using dropdown suggestions.
- Add assertions to verify the selected date.
- Improve exception handling and test reporting.
- Organize the script using the Page Object Model (POM).
- Integrate the project with TestNG and Maven.

## 👨‍💻 Author

**Utkarsh Howale**

Software Testing | Selenium WebDriver | Java | Test Automation

## ⚠️ Disclaimer

This project is intended for learning and educational purposes. Website UI elements and locators may change over time.
