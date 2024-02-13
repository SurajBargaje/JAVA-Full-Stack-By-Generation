# Codecademy Learners Mockup Data

## Overview
This project is slightly different than others you have encountered thus far on Codecademy. Instead of a step-by-step tutorial, this project contains a series of open-ended requirements which describe the project you’ll be building. There are many possible ways to correctly fulfill all of these requirements, and you should expect to use the internet, Codecademy, and other resources when you encounter a problem that you cannot easily solve.

## Project Goals
Use your knowledge of SQL and analyze some mockup Codecademy learners data. There are two tables:

### Users Table:
- user_id
- email_domain
- country
- postal
- mobile_app
- sign_up_at

### Progress Table:
- user_id
- learn_cpp
- learn_sql
- learn_html
- learn_javascript
- learn_java

## Prerequisites
In order to complete this project, you should be familiar with queries, aggregate functions, and multiple table joins. Ideally, you’ve completed Analyze Data with SQL.

## Project Requirements
First, use SELECT * from both tables and use your knowledge of queries and aggregate functions to get to know the data:

- What are the Top 25 schools (.edu domains)?
- How many .edu learners are located in New York?
- The mobile_app column contains either mobile-user or NULL. How many of these Codecademy learners are using the mobile app?

The data type of the sign_up_at column is DATETIME. It is for storing a date/time value in the database. SQLite comes with a strftime() function - a very powerful function that allows you to return a formatted date. Now, using this function, query for the sign up counts for each hour.

Join the two tables using JOIN and then see what you can dig out of the data!

- Do different schools (.edu domains) prefer different courses?
- What courses are the New Yorkers students taking?
- What courses are the Chicago students taking?

## Solution
Great work! Visit our forums to compare your project to our sample solution code. You can also learn how to host your own solution on GitHub so you can share it with other learners! Your solution might look different from ours, and that’s okay! There are multiple ways to solve these projects, and you’ll learn more by seeing others’ code.

To experiment with the solution code, open it in DB Browser if you are working on your own computer, or you can copy and paste the text from the .sql file into the SQL code editor here in the project.
