# Java Memory Game with Linked Lists 🧠🎯

A console-based animal-themed memory matching game implemented using custom Single Linked List data structures in Java.

## 🎮 Game Overview

This project simulates a memory matching game where players need to find identical animal pairs. The computer randomly selects tiles from two linked lists and tries to match them. The game demonstrates advanced linked list operations and file handling in Java.

## ✨ Features

- 🔗 **Custom Single Linked List Implementation**
- 🐾 **Animal-themed tile matching**
- 📁 **File I/O for animal data and high scores**
- 🎲 **Random game board generation**
- 📊 **Advanced scoring system**
- 🏆 **High score table with persistence**
- 🌈 **Colorful console output**
- 🎯 **Automatic computer gameplay**

## 🎯 How to Play

1. The program reads animal names from `animals.txt`
2. Enter the number of animal pairs (n)
3. Two linked lists are randomly filled with matching pairs
4. Computer randomly selects one tile from each list
5. If they match: +20 points, tiles are removed
6. If they don't match: -1 point, try again
7. Game ends when all pairs are matched

## 🚀 How to Run

```bash
# Compile all Java files
javac *.java

# Run the game
java Main
📋 Requirements

Create animals.txt file in D:\ with animal names (one per line)
Create highscoretable.txt file in D:\ for score persistence

Sample animals.txt:
Dog
Cat
Bird
Rabbit
Fish
Duck
Sheep
Horse
Cow
Lion
📁 Project Structure
java-memory-game-linkedlist/
├── Main.java              # Game logic and user interface
├── Node.java              # Node class for linked list
├── SingleLinkList.java    # Custom Single Linked List implementation
├── animals.txt            # Animal data file (sample)
└── README.md              # Project documentation
🛠️ Technologies Used

Language: Java
Data Structure: Custom Single Linked List
File Operations: BufferedReader, FileWriter
Concepts: OOP, Random algorithms, Memory game logic
Console: ANSI color codes for enhanced UI

🎯 Learning Objectives
This project demonstrates:

Advanced linked list operations (add, delete, find, display)
File I/O operations in Java
Random algorithm implementation
Game development with data structures
Memory management and node manipulation
Score tracking and persistence

🏗️ Code Structure
Node.java

Generic node implementation
Data and link fields with getters/setters

SingleLinkList.java

Complete linked list implementation
Methods: add, delete, find, display, size
File writing functionality for high scores

Main.java

Game logic and flow control
Random selection algorithms
File reading and score management
User interaction and display

👨‍💻 Author
İrem TEKİN
Computer Engineering Student - Dokuz Eylül University
📧 [iremtekin1107@gmail.com]
🔗 [https://www.linkedin.com/in/irem-tekin11/]
📜 Academic Note
This project was created for educational purposes as part of CME1212 Algorithms and Programming II course, focusing on linked list data structures and their practical applications.

⭐ Don't forget to star this repository if you found it helpful!
