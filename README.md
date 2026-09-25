# Prototype Design Pattern in Java

#Overview

This project demonstrates the *Prototype Design Pattern* in Java using a `Resume` example.

The Prototype Pattern is a **Creational Design Pattern** that creates new objects by copying an existing object instead of creating them from scratch.

In this project, an existing `Resume` object is used as a prototype. A new Resume object is created using the `clone()` method and can then be modified independently.

## How It Works

The project contains two classes:

- `Resume.java` - Represents the Prototype object and contains the `clone()` method.
- `Client.java` - Creates the original Resume, clones it, and demonstrates the copied object.

The cloning process works like this:

text:
Original Resume
      |
    clone()
      |
      ↓
Cloned Resume
      |
Modify the cloned object
#Example
Resume original = new Resume(
        "Kiranmai",
        "CSE",
        "PACE",
        "Java, Python, SQL"
);

Resume copy = original.clone();
System.out.println(original == copy);
output:
false

copy.setName("Sai");
## Advantages
- Avoids creating complex objects from scratch.
- Makes object creation easier when a similar object already exists.
- Allows an existing object to be copied and customized.
- Can be useful when object creation is expensive or involves many properties.
