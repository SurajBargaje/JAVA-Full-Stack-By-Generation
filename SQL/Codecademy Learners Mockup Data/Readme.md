# Codecademy Learners Mockup Data Analysis 📊

Welcome to the Codecademy Learners Mockup Data Analysis project! In this project, we'll be analyzing mockup data of Codecademy learners to gain insights into their learning patterns and behaviors.

## Project Overview
This project involves analyzing data from two tables: `users` and `progress`. The `users` table contains information about learners, such as their `user ID`, `email domain`, `country`, and `sign-up timestamp`. The `progress` table tracks learners' progress in various courses, including `CPP`, `SQL`, `HTML`, `JavaScript`, and `Java`.

## Project Goals
Our goals for this project include:

- Exploring the data using SQL queries and aggregate functions.
- Identifying insights such as the top 25 schools (.edu domains), the number of .edu learners in New York, and the number of learners using the mobile app.
- Utilizing the strftime() function in SQLite to analyze sign-up counts for each hour.
- Performing table joins to delve deeper into the data, such as understanding course preferences among different schools and courses taken by learners in specific locations like New York and Chicago.

## Tasks Overview
### Prerequisites:
Familiarity with SQL queries, aggregate functions, and multiple table joins.

### Project Requirements:
- Explore the data using SELECT * from both tables and aggregate functions to understand the dataset.
- Answer questions such as the top 25 schools (.edu domains), .edu learners in New York, and mobile app users.
- Use the strftime() function to analyze sign-up counts for each hour.
- Perform table joins to uncover insights like course preferences among different schools and courses taken by learners in specific locations.

## Database Schema
### Users Table:
- user_id: Integer
- email_domain: Text
- country: Text
- city: Text
- postal: Integer
- mobile_app: Text
- sign_up_at: Datetime

### Progress Table:
- user_id: Integer
- learn_cpp: Text
- learn_sql: Text
- learn_html: Text
- learn_javascript: Text
- learn_java: Text

## Setup Instructions
If you choose to work on this project, you can download the necessary files from this repository resources and use SQLite to run SQL commands using DB Browser.

## Resources
- SQLite Setup Guide
- DB Browser

## Ready to Dive In?
Let's start analyzing the Codecademy learners data and uncover valuable insights that will help us understand their learning journey better! 🚀
