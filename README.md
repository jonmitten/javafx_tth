# javafx_tth
The JavaFX coursework from Team Treehouse

This project is a follow-along for the [Team Treehouse Java course on JavaFX](https://teamtreehouse.com/library/build-a-javafx-application) GUI interface development. It's the last of the "Learn Java" library courses. 
I will attempt to commit each section's worth of code update at the end of each section, in a branch labeled as such, and then merge back into master as appropriate.

In JavaFX, the presentation layer uses the theatre analogy:
Stages contain Scenes
Scenes contain Scene Graphs
Scene Graphs contain Nodes

####Node Types
UI Controls:
* Text fields
* Buttons
* Checkboxes
* sliders
* file choosers

Shapes:
* Circles, squares, etc
* color
* rotation
...

Using a layout:
* HBox - horizontal plane layout
* VBox - virtical plane layout
* borderpane - 5 regions:
    * top 
    * left 
    * center
    * right 
    * bottom
* StackPane - allows you to stack things (like z-index)
* GridPane - a clean way to place things into rows and columns, by row and column indexes.
and more!

You can also use a WebView, where a web page is embedded on the stage itself.

####Getting Started
IntelliJ IDEA has JavaFX projects templates built in, so it's easy to start a new 
project as a 
JavaFX application.

Taking a look at the Main class, note that Main `extends Application`. 
Main inherits the `Applicaiton` class
and the first thing that IntelliJ IDEA does to set this class up correctly is to 
@Override the `start` method from the `Application` class. The `start` method accepts
the Stage as an argument. 

A very simple thing we can start practicing with is a root node, so we set up 
`Group root = new Group`.

####Grids

Grids are used to help align object on a stage. 

####Separating the Layout

Helping to make sure that it's easy to figure out how layout is presented in code, 
there are tools to make use of. 

XML is used a lot in Java, as is HTML.

Coming from a background that includes HTML, this is going to be pretty straight forward. 

The FXMLLoader class that we commented out in previous exercises, is that loader
to import XML as a layout structure markup. 

FXML is the JavaFX-specific XML doctype. 

####Controller

With the MVC paradigm, the FXML acts as the view, and there is a controller class
that is made to handle the events and actions. The FXML will namespace an ID and then call to a 
controller method with the onAction attribute.

####Styling

CSS can be used with FXML. 
Inline styling can be used as it is with HTML. They can also be imported as external
stylesheets, as would be expected for most large-scale applications.
[JavaFX CSS Reference can be researched here.](https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html) 