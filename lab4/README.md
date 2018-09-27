CRC Cards for Din Tai Fung sign-up

CLASS: WaitList

RESPONSIBILITIES:
Accepts a Customer's Name, Cell Phone Number, and the Number of People in their Party.
Creates an entry with the given information to the bottom of the list.
Returns a "Table Ready" message to the Customer when a table is available.
Accepts a "Confirm" or "Leave" message from the Customer.

COLLABORATORS:
WaitListState


CLASS: WaitListState

RESPONSIBILITIES:
Checks if an available table can accommodate a customer party from the wait list.
Moves down the list and checks subsequent entries until a match.

COLLABORATORS:


CLASS: TableNotReadyState

RESPONSIBILITIES:

COLLABORATORS:


CLASS: TableReadyState

RESPONSIBILITIES:

COLLABORATORS:


Going for State Pattern...
