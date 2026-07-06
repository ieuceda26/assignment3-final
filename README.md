# Assignment 3
## Character Gallery API
# What is This Project?

This is a CRUD (Create, Read, Update, Delete) API that manages Dragon ball Z characters

**CRUD:**

- **Create**: Add new blog posts
- **Read**: Retrieve existing blog posts
- **Update**: Modify existing blog posts
- **Delete**: Remove blog posts

---
Delpoyed at: https://assignment3-final.onrender.com/

## Endpoints
## Get all characters:
GET /api/characters

## Get a character by ID:
GET /api/characters/{id}

## Add a new character
POST /api/characters

BODY:

{
    "name": "Goku",
    "description": Earth's greatest warrior,
    "universe": "Universe 7",
    "role": "Hero"
}

## Update an existing character

PUT /api/characters/{id}

Body:

{
    "name": "Goku",
    "description": saiyan warrior,
    "universe": "Universe 7",
    "role": "Hero"
}

## Delete a character
DELETE /api/characters/{id}

## Get all characters by universe
GET /api/characters/universe/{universe}

## Search characters by name
GET /api/characters/search?name={string}

Example:GET /api/characters/search?name=go