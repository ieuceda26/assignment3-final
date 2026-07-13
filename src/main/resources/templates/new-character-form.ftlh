<!DOCTYPE html>
<html>

<head>
    <title>${pageTitle!'Add a Character'}</title>
    <link rel="stylesheet" href="/styles.css">
</head>

<body>

    <nav>
        <a href="/characters">Home</a>
        <a href="/about">About</a>
        <a href="/characters/1">Details</a>
        <a href="/characters/new">Add a Character</a>
    </nav>

    <div class="form-container">
        <h1>${pageTitle!'Add a Character'}</h1>

        <form action="/characters/save" method="post">
            
            <label>Name:</label>
            <input type="text" id="name" name="name">

            <label>Universe:</label>
            <input type="text" id="universe" name="universe">

            <label>Role:</label>
            <input type="text" id="role" name="role">

            <label>Abilities:</label>
            <input type="text" id="abilities" name="abilities">

            <label>Image URL:</label>
            <input type="text" id="imageUrl" name="imageUrl" placeholder="https://example.com/image.jpg or /images/character.png">

            <label>Species:</label>
            <input type="text" id="species" name="species">

            <label>Power Level:</label>
            <input type="number" id="powerLevel" name="powerLevel" min="0">

            <label>First Appearance:</label>
            <input type="text" id="firstAppearance" name="firstAppearance">

            <label>Short Description:</label>
            <textarea id="description" name="description"></textarea>

            <button type="submit">Add Character</button>
        </form>
    </div>

</body>

</html>