# CardLayout

CardLayout is a type of layout used to arranged the components in such a manner that only one component is visible at a time. It treats each component as a card that is why it is known as CardLayout.


### Constructors of CardLayout class

1. __CardLayout()__: creates a card layout with zero horizontal and vertical gap.

1. __CardLayout(int hgap, int vgap))__: creates a card layout with the given horizontal and vertical gap.


### Generic methods of CardLayout class 

* _public void next(Container parent)_: is used to flip to the next card of the given container.

* _public void previous(Container parent)_: is used to flip to the previous card of the given container.

* _public void first(Container parent)_: is used to flip to the first card of the given container.

* _public void last(Container parent)_: is used to flip to the last card of the given container.

* _public void show(Container parent, String name)_: is used to flip to the specified card with the given name.


### [Example](CardLayoutDemo.java)
