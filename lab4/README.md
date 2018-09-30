CRC Cards for Din Tai Fung sign-up

///////////////////////////////////////////////////////////////

CLASS: WaitList

RESPONSIBILITIES:
Maintains a waiting list for customer parties.
Accepts a Customer's Name, Cell Phone Number, and the Number of People in their Party.
Creates an entry with the given information to the bottom of the list.
Returns a "Table Ready" message to the Customer when a table from tablelist is available.
Accepts a "Confirm" or "Leave" message from the Customer.
Removes the Customer's entry after their reply.
Find another Customer that the table accommodates or send signal to tablelist to change table's state.

COLLABORATORS:
TableList

///////////////////////////////////////////////////////////////

CLASS: TableList

RESPONSIBILITIES:
Maintains a list for all tables in the restaurant.
Each table can accommodate a certain number of customers.
Each table has two states, can be changed by a signal from waitlist.
Returns an available table's info to waitlist.

COLLABORATORS:
TableStatus

///////////////////////////////////////////////////////////////

CLASS: TableStatus

RESPONSIBILITIES:
Keeps the state of a table.
Change state from TableNotReadyState to TableReadyState and vice versa with a signal.

COLLABORATORS:
TableNotReadyState, TableReadyState

///////////////////////////////////////////////////////////////

CLASS: TableNotReadyState

RESPONSIBILITIES:
Signals the waitlist that a table is not ready.

COLLABORATORS:

///////////////////////////////////////////////////////////////

CLASS: TableReadyState

RESPONSIBILITIES:
Signals the waitlist that a table is ready.

COLLABORATORS:

///////////////////////////////////////////////////////////////

The patterns I decided to go with are observer and state because the waitlist can observe the tablelist for when a table becomes available. There are two states for each table, "Table Ready" and "Table Not Ready". The waitlist will do nothing when all tables are in the state "Table Not Ready". When a table changes its state to "Table Ready" the tablelist will return the table's number of seats available to the waitlist. The waitlist will notify the first customer party the table can accommodate that a table is ready and wait for their response. Whether a customer sends "Confirm" or "Leave" that customer will be removed from the waitlist. The waitlist will either find another customer match or tell the tablelist to set the table's state back to "Table Not Ready".

For the observer pattern, TableList plays the ConcreteSubject role and WaitList plays the ConcreteObserver role.

For the state pattern, TableStatus plays the Context role, TableNotReadyState and TableReadyState both play the ConcreteState subclasses roles.
