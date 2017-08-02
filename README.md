# Readme zum Informatik Projekt "Verkehrssimulation"


	Dieses Projekt wurde erstellt von:

* [Denis Brendel](https://github.com/DenisBrendel "Link zum GitHub-Profil von Denis Brendel")
* [Marcel Maison](https://github.com/FrEeDoM-Sc2 "Link zum GitHub-Profil von Marcel Maison")


	Die Erstellung dieses Projekts ist Teil der Vorlesung "Informatik B" im Sommersemester 2017 an der TH Bingen.
	Die Vorlesung wird geleitet von :
	
* [Nicolai Parlog](https://github.com/nicolaiparlog)


	
	
# Aufgabenstellung


	Development

To develop the project, a lot of tasks have to be completed. Some requirements on how to do that:

*   As you can see below, tasks are organized in blocks. Each block has to be completed before beginning with the next one but within each block you can pick any order that makes sense to you.
*   At the beginning of the project, create one milestone per block.
*   At the beginning of each milestone (at the latest), create one issue per top-level bullet and add it to the correct milestone. Update them by assigning them to you when you start working on them and close them when you’re done. If something's not clear, ask me on the issue.
*   Wherever possible use pull requests to complete a task and please wait with merging them until I give it a thumbs-up.
*   Release a new version after each block:
    * create a Git tag, e.g. v1.0, and push it
    * make a release on GitHub
    * use Maven to build a JAR and upload it to your release


	
	Project Infrastructure
	

*   create a README.md describing the project and listing your names (they do not have to be real names if you don’t want; GitHub user names are fine as well)
*   add a license and document it in the README
*   decide on a language (e.g. by discussing it on the issue that belongs to this task) and document it in the README:
    *   code (e.g. classes and variables) needs to be English
    *   comments can be English or German but must be consistent
    *   conversation on GitHub can be English or German but must be consistent (does not have to be the same as comments)
*   research what a code of conduct is, how it relates to open source projects, and pick one; add it as a file to the project and document it in the README
*   create a .gitignore file that prevents adding files/folders that are specific to IntelliJ IDEA and Maven
*   create a Maven/Kotlin project that contains a simple HelloWorld.kt class with a main method printing "Hello, World." and that successfully builds a JAR
*   integrate with Travis (I’ll do that - ping me on the issue when Maven is set up)
*   set up JUnit 4 by extending pom.xml and writing a small HelloWorldTest
*   extend the README to tell users how to launch the application
*   release version 1.0
	
