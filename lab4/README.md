CRC Cards for Din Tai Fung sign-up

CLASS: WaitList

RESPONSIBILITIES:
Maintains a waiting list for customer parties.
Accepts a Customer's Name, Cell Phone Number, and the Number of People in their Party.
Creates an entry with the given information to the bottom of the list.
Returns a "Table Ready" message to the Customer when a table is available.
Accepts a "Confirm" or "Leave" message from the Customer.
Removes the Customer's entry after their reply.

COLLABORATORS:
WLState


CLASS: WLState

RESPONSIBILITIES:
Checks if an available table can accommodate a customer party from the wait list.
Starts checking the top entry and moves down to subsequent entries until a match is found.
Returns confirmation that a table is ready for the selected customer party.
If receives "Confirm" then move state from TableReady to TableNotReady.
If receives "Leave" then check more entries for other matches.

COLLABORATORS:
WaitList


CLASS: TableNotReadyState

RESPONSIBILITIES:
Listens for the first table that becomes available.
Keeps list of all available tables.

COLLABORATORS:
WLState


CLASS: TableReadyState

RESPONSIBILITIES:
Checks the number of seats for the first available table.
Returns number of seats for the available table.

COLLABORATORS:
WLState


I decided to go with state because there are two states for this waiting list, "Table Ready" and "Table Not Ready". When the current state is "Table Not Ready" it will wait for the first table that becomes available. When the current state is "Table Ready" it will return the number of seats available for that table and wait to move on to the next available table.

WaitList plays the Context role, WLState plays the State role, TableNotReadyState plays the ConcreteStateA role, and TableReadyState plays the ConcreteStateB role.
