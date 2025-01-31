# Game API
This is a RESTful API built with Java that manages game information, including creating a database, storing game data, retrieving game details by ID, listing all games, and changing the order of games in the database.

# **Features**
  - Database Management: Automatically creates and manages a database to store game information.
  - Retrieve Game Information: Fetch game details by providing the game ID.
  - List All Games: Get a list of all games stored in the database.
  - Change Game Order: Reorder games in the database to change their display order.

# **Endpoints**
  - localhost:8080/games/ - Find all games
  - localhost:8080/games/{id} - Find game by id
  - localhost:8080/lists/ - Find all lists
  - localhost:8080/lists/{listId}/games - Find games by listId
  - localhost:8080/lists/{listId}/replacement - Move game to list by listId
