Parking System (Java)

This is a simple parking lot management application written in Java.
It allows you to add vehicles to the parking lot, remove them, and check the current parking status and earnings.
📌 Features

    Supports multiple vehicle types: Car, Bus, Motorcycle, Bicycle.
    Limits the number of parking spots for each vehicle type.
    Adds vehicles if there are available spots.
    Calculates and shows the total earnings (each vehicle pays a parking fee).
    Displays current occupancy and percentage of used spots per vehicle type.
    Shows messages when there are no free spots or when a vehicle is not found.

📂 Project Structure

    Main — Runs the application. Creates a Parking instance, creates several vehicles (Pojazd), and simulates entering and leaving the parking lot.
    Parking — Main class that stores vehicles in a Map grouped by vehicle type. Handles adding/removing vehicles and shows the current parking state.
    Pojazd — Class representing a vehicle with properties: ID, brand, model, license plate number, and type.
    TypPojazdu — Enum defining possible vehicle types (SAMOCHOD = Car, AUTOBUS = Bus, MOTOCYKL = Motorcycle, ROWER = Bicycle).

✅ How it works

    The Main class creates a Parking object with:
        Maximum number of spots for each vehicle type.
        Parking fee per vehicle.
    Several Pojazd (vehicles) are created with different types.
    Vehicles are added using wpuscPojazd(). If there are no free spots for a type, a message is displayed.
    stanParkingu() prints the number of vehicles, percentage of occupied spots, and total earnings.
    Vehicles can be removed using wypuscPojazd(ID) by providing their unique ID.

⚙️ Run

    This project is console-based.
    Compile and run using your IDE (e.g., IntelliJ, Eclipse) or from the command line:

    javac Main.java
    java parking.v5.Main

