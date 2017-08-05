# Readme zum Informatik Projekt "Verkehrssimulation"


	Dieses Projekt wurde erstellt von:

* [Denis Brendel](https://github.com/DenisBrendel "Link zum GitHub-Profil von Denis Brendel")
* [Marcel Maison](https://github.com/FrEeDoM-Sc2 "Link zum GitHub-Profil von Marcel Maison")


Die Erstellung dieses Projekts ist Teil der Vorlesung "Informatik B" im Sommersemester 2017 an der TH Bingen.
Die Vorlesung wird geleitet von :

* [Nicolai Parlog](https://github.com/nicolaiparlog)


Das Schreiben des Codes dieser Simulation erfolgt auf Englisch.
Kommentare im Code sind auf Deutsch.
Konversation auf Github ist auf Deutsch.
Die Aufgabenstellung in der README.md wurde von Nicolai Parlog erstellt und ist daher auf Englisch, ansonsten wird in README.md Deutsch verwendet

# Lizenz und Verhaltenskodex

* Verlinkung auf die [Lizenz](https://github.com/DenisBrendel/Informatik-Projekt/blob/master/LICENSE "Link auf die Textdatei")
* Verlinkung auf den [Verhaltenskodex](https://github.com/DenisBrendel/Informatik-Projekt/blob/master/CODE_OF_CONDUCT.md "Link auf die Textdatei")



# Starten der Anwendung

Die Anwendung erfolgt durch das Ausführen der .jar Datei. Dies geschieht über das cmd-Tool (Windows).
Der Befehl zu Ausführen ist:

java -jar "Dateipfad" (ohne "")

Die .jar Datei erhält man durch herunterladen eines Releases.




# Aufgabenstellung


## Development

To develop the project, a lot of tasks have to be completed. Some requirements on how to do that:

*   As you can see below, tasks are organized in blocks. Each block has to be completed before beginning with the next one but within each block you can pick any order that makes sense to you.
*   At the beginning of the project, create one milestone per block.
*   At the beginning of each milestone (at the latest), create one issue per top-level bullet and add it to the correct milestone. Update them by assigning them to you when you start working on them and close them when you’re done. If something's not clear, ask me on the issue.
*   Wherever possible use pull requests to complete a task and please wait with merging them until I give it a thumbs-up.
*   Release a new version after each block:
    * create a Git tag, e.g. v1.0, and push it
    * make a release on GitHub
    * use Maven to build a JAR and upload it to your release

## Project Infrastructure

*   create a README.md describing the project and listing your names (they do not have to be real names if you don’t want; GitHub user names are fine as well)
*   add a license and document it in the README
*   decide on a language (e.g. by discussing it on the issue that belongs to this task) and document it in the README:
    *   code (e.g. classes and variables) needs to be English
    *   comments can be English or German but must be consistent
    *   conversation on GitHub can be English or German but must be consistent (does not have to be the same as comments)
*   research what a code of conduct is, how it relates to open source projects, and pick one; add it as a file to the project and document it in the README
*   create a .gitignore file that prevents adding files/folders that are specific to IntelliJ IDEA and Maven
*   create a Maven/Kotlin project that contains a simple HelloWorld.kt class with a Traffic_Simulation.main method printing "Hello, World." and that successfully builds a JAR
*   integrate with Travis (I’ll do that - ping me on the issue when Maven is set up)
*   set up JUnit 4 by extending pom.xml and writing a small HelloWorldTest
*   extend the README to tell users how to launch the application
*   release version 1.0

## Create a simple Traffic Simulation

*   create a simulation consisting of cars and an abstract, monolithic road network (meaning it does not yet consist of individual roads - it’s just a single network); each car knows whether it wants to drive and the road network has a total capacity for cars; implement a single simulation step (which is supposed to represent one hour), where:
    *   each individual car announces whether it wants to drive or not
    *   the network tallies up the number of cars on the road and compares it to its own capacity
    *   the network decides for each car whether it drives or is delayed due to traffic jams; that decision is based on how many cars are on the road compared to the network’s capacity:
        *   less than or equal to capacity ~> all can drive
        *   over capacity ~> all are delayed
*   write a scenario function that simulates a scenario with about a dozen cars
*   let the cars keep track of whether they can drive or were delayed and print that information at the end of the simulation
*   write the Traffic_Simulation.main program, which uses Univocity Parsers to parse input (cars and their interest to drive) and write resulting data (drive vs delay) as CSV (this does not touch on the scenario function, which should be kept around)
*   extend the README by writing a user documentation, explaining users how to use the program

When all that's done:

*   release version 2.0

## Extend Simulation to cover an entire Day

*   randomize the decision for whether each individual car can drive or gets delayed; the chance for a delay depends on how many cars or on the road compared to the network’s capacity:
    *   less than at 50% capacity: 5% chance of delay
    *   less than at 70% capacity: 10% chance of delay
    *   less than at 90% capacity: 20% chance of delay
    *   less than at 110% capacity: 30% chance of delay
    *   less than at 125% capacity: 50% chance of delay
    *   less than at 150% capacity: 70% chance of delay
    *   above 150% capacity: 90% chance of delay
*   cover an entire day by simulating 24 steps in a row:
    *   cars now need to know for each of the 24 hours whether they want to drive or not
    *   if a car gets delayed it can not “fulfill” it’s desire to drive, meaning it has to try to drive again in the next step (small example: a car wants to drive in steps 8 and 9 but gets delayed in 9; now it also wants to drive in step 10)
    *   extend result tracking by making sure that each car knows for every step whether it could drive or was delayed
    *   update the scenario function to the simulation’s new requirements
*   extend CSV input/output to match the new requirements and results:
    *   extend input to include for each hour whether a car wants to drive
    *   extend output to include for each hour whether the car drove or was delayed
*   update the user documentation to match the new program behavior

When all that's done:

*   release version 3.0

## Extend Simulation with various Paticipants

*   extend the simulation to allow for other traffic participants:
    *   create a suitable interface, of which the car is one implementation
    *   make sure the code simulating individual steps only uses that interface
    *   add implementations for trucks, trams, and bikes
    *   extend the scenario to include a total of about a dozen non-cars
*   give each kind of traffic participant a different chance of getting delayed:
    *   cars keep the chances that were defined earlier
    *   for trucks, each individual chance is 5% higher than for cars
    *   for trams, each individual chance is half of that for cars
    *   for bikes, the chance is always 5% unless the network is over 150% capacity, in which case the chance increases to 10%.
*   change how different kinds of traffic participants clog the road network:
    *   cars continue to “cost” 1 capacity
    *   trucks cost 3 capacity
    *   trams cost 5 capacity
    *   bikers cost 0.1 capacity
*   extend CSV input to allow defining different participants
*   update the user documentation to explain how to define input and read output

When all that's done:

*   release version 4.0


