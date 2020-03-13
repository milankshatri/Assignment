# Various Event Objects their Constructors, methods and Examples

### Event And Listener(Event Handling)

Event is the change in state of an object. The java.awt.event package provides the event and listener for event handling in Java.

##### Java Event classes and Listner Interfaces
Event Classes|Listener Interfaces
---|---
ActionEvent|ActionListener
MouseEvent|MouseListener<br>MouseMotionListener
MouseWheelEvent|MouseWheelListener
KeyEvent|KeyListener
ItemEvent|ItemListener
TextEvent|TextListener
AdjustmentEvent|AdjustmentListner
WindowEvent|WindowListener
ComponentEvent|ComponentListner
ContainerEvent|ContainerListner
FocusEvent|FocusListner

----------------

### ActionEvent Class

An Action Event is generated when:
	* a button is pressed.
	* a list item is clicked.
	* menu item is clicked.

__*Constructor*__
1. ActionEvent(Object src,int type,String cmd)
1. ActionEvent(Object src, int type, String cmd, int modifiers)
1. ActionEvent(Object src, int type, String cmd, long when, int modifiers)

	* src = reference to the object that generated this event
	* type = Determine type of event
	* cmd = command string
	* modifier = indicated modifier keys(ALT,CTRL,SHIFT);values are ALT_MASK, CTRL_MASK, SHIFT_MASK
	* when = specifies when the event occured

_**Methods**_
1. String getActionCommand()
1. long getWhen()
1. int getModifiers()
1. String parmString()

_**[Example](ActionEventDemo.java)**_

--------------

### KeyEvent class

An event which indicates that a keystrike occured in a component.

__*Constructor*__
1. KeyEvent(Component src, int id, long when, int modifiers, int keyCode, char keyChar)
1. KeyEvent(Component src, int id, long when, int modifiers, int keyCode, char keyChar, int keyLocation)

_**Methods**_
1. getExtendedKeyCode()
1. getKeyChar()
1. getKeyLocation()
1. getKeyModifiersText(int modifiers)
1. getKeyText()

_**[Example](KeyEventDemo.java)**_

-----------

### TextEvent Class

The object of this class represents the text events and is generated when character is entered in the text fields or text area. 

__*Constructor*__
* TextEvent(Object source, int id)

_**Methods**_
* pramString()

_**[Example](TextEventDemo.java)**_

-----------------------------------------------------------------
