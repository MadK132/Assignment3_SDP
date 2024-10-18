# Assignment3_SDP

Assignment 1: Adapter Pattern - Audio Player
Classes:
AudioPlayer (Interface): Defines a method play(String audioType, String fileName) to play audio files.
MP3Player (Class): Implements AudioPlayer and provides the functionality to play MP3 files.
WAVPlayer (Interface): Defines a method playWAV(String fileName) for playing WAV files.
AACPlayer (Interface): Defines a method playAAC(String fileName) for playing AAC files.
AdvancedAudioPlayer (Class): Implements both WAVPlayer and AACPlayer to support playing WAV and AAC files.
AudioAdapter (Class): Acts as an adapter to bridge the AudioPlayer with AdvancedAudioPlayer to support multiple audio formats.
MusicPlayerApp (Class): Demonstrates using the adapter to play MP3, WAV, and AAC files.

Assignment 2: Bridge Pattern - Remote Control System
Classes:
Device (Interface): Defines methods like powerOn(), powerOff(), setChannel(int channel), and setVolume(int volume) for controlling electronic devices.
TVDevice, DVDDevice, SoundSystemDevice (Classes): Concrete implementations of the Device interface for controlling specific devices.
RemoteControl (Abstract Class): Abstract class with a reference to a Device, serving as the bridge.
BasicRemote, AdvancedRemote (Classes): Concrete remotes with varying levels of functionality.
HomeEntertainmentSystem (Class): Demonstrates how the remote control works with different devices.

Assignment 3: Composite Pattern - Menu System
Classes:
MenuComponent (Abstract Class): Defines methods like getName(), getDescription(), getPrice(), and print() for both menu items and sub-menus.
MenuItem (Class): Represents individual dishes in the menu.
Menu (Class): Contains MenuComponent objects (either MenuItem or other Menu objects).
RestaurantApp (Class): Demonstrates how to build a multi-level menu and print it.

Assignment 4: Decorator Pattern - Pizza Ordering System
Classes:
Pizza (Interface): Defines methods getDescription() and getCost() for pizzas.
MargheritaPizza, VegetarianPizza (Classes): Concrete pizza classes that implement the Pizza interface.
ToppingDecorator (Abstract Class): Extends the Pizza interface and serves as the base class for all topping decorators.
CheeseTopping, MushroomTopping, PepperoniTopping (Classes): Concrete decorators that add toppings to the base pizza.
PizzaShop (Class): Demonstrates creating pizzas with multiple toppings.

Assignment 5: Facade Pattern - Smart Home System
Classes:
Light, Thermostat, SecuritySystem, EntertainmentSystem (Classes): Represent individual smart home devices with specific operations.
SmartHomeFacade (Class): Encapsulates the interaction with all the smart devices and provides simplified methods like leaveHome(), arriveHome(), nightMode(), and movieMode().
SmartHomeApp (Class): Demonstrates how the facade simplifies control of the smart home.

Assignment 6: Flyweight Pattern - Character Rendering in a Text Editor
Classes:
Character (Class): Represents a character with intrinsic state (value, font, size) and extrinsic state (position).
CharacterFactory (Class): Manages and reuses character objects to minimize memory consumption.
TextEditor (Class): Uses the CharacterFactory to insert and render characters efficiently.
TextEditorApp (Class): Demonstrates the memory efficiency of rendering a large document using the Flyweight pattern.

Assignment 7: Proxy Pattern - Online Learning Platform
Classes:
VideoLecture (Interface): Defines methods getInfo() and play() for video lectures.
RealVideoLecture (Class): Simulates loading and playing a video lecture.
ProxyVideoLecture (Class): Implements lazy loading by only creating a RealVideoLecture when the video is played for the first time.
OnlineCourse (Class): Contains multiple video lectures and demonstrates lazy loading.
LearningPlatformApp (Class): Shows how video lectures are only loaded when a student starts playing them.
