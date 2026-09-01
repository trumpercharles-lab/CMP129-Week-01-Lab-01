CMP 129 – Computer Science II
Week 1 – Lab 1: Java Review
Learning Objectives

After completing this lab, students should be able to:

Accept user input using the Scanner class.
Store data using appropriate variables and data types.
Perform arithmetic calculations.
Use Math.pow() in a mathematical formula.
Display numerical results using formatted output.

Complete both programming problems. Create a separate Java file for each problem.

Problem 1: Box Office

A movie theater keeps 20% of the revenue earned from ticket sales. The remaining 80% is paid to the movie distributor.

Write a Java program that calculates the theater’s gross and net box-office profit for one night.

The program must ask the user to enter:

The name of the movie
The number of adult tickets sold
The number of child tickets sold

Use the following ticket prices:

Adult ticket: $10.00
Child ticket: $6.00

Your program must calculate and display:

Movie name
Number of adult tickets sold
Number of child tickets sold
Gross box-office profit
Net box-office profit retained by the theater
Amount paid to the movie distributor

Format all monetary amounts to two decimal places.

Sample Output
Movie Name:                  Wheels of Fury
Adult Tickets Sold:          382
Child Tickets Sold:          127
Gross Box Office Profit:     $4582.00
Net Box Office Profit:       $916.40
Amount Paid to Distributor:  $3665.60
Required Filename
BoxOffice.java
Problem 2: Interest Earned

Assume that no additional deposits are made after the original investment. The balance in a savings account after one year can be calculated using this formula:

Amount = Principal × (1 + Rate ÷ T)ᵀ

Where:

Principal is the original amount deposited.
Rate is the annual interest rate expressed as a decimal.
T is the number of times the interest is compounded during the year.

For example:

Annually: T = 1
Quarterly: T = 4
Monthly: T = 12

Write a Java program that asks the user to enter:

The principal amount
The annual interest rate
The number of times interest is compounded during the year

The program must calculate and display:

Annual interest rate
Number of times compounded
Principal
Interest earned
Final amount in savings

You may use Math.pow() to perform the exponent calculation. Format the interest rate and all monetary amounts to two decimal places.

Sample Output
Interest Rate:       4.25%
Times Compounded:    12
Principal:            $1000.00
Interest Earned:      $43.34
Amount in Savings:    $1043.34
Required Filename
InterestEarned.java
General Requirements
Include your name, the course number, the lab number, and the date in a comment at the beginning of each Java file.
Use meaningful variable names.
Include comments that explain the important parts of your program.
Use the Scanner class to accept input.
Format monetary results to two decimal places.
Test both programs using different input values.
Each program must compile and run without errors.
Do not submit completed code generated entirely by an AI tool.
If you use Copilot or another AI tool for explanations, hints, or debugging, document that assistance in the AI Use Report.
Submission

Submit or push the following files to your Week 1 GitHub repository:

BoxOffice.java
InterestEarned.java
AI-Use-Report.md

Make at least two meaningful commits while completing the lab. Use clear commit messages describing your progress.
