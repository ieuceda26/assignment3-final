<!DOCTYPE html>
<html>
<head>
    <title>Add a Character</title>
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
    <h1>Add a New Character</h1>

    <form action="/characters/save" method="post">
        <label>Name:</label>
        <input type="text" name="name">

        <label>Universe:</label>
        <input type="text" name="universe">

        <label>Role:</label>
        <input type="text" name="role">

        <label>Abilities:</label>
        <input type="text" name="abilities">

        <label>Image URL:</label>
        <input type="text" name="imageUrl">

        <label>Species:</label>
        <input type="text" name="species">

        <label>Short Description:</label>
        <textarea name="description"></textarea>

        <button type="submit">Add Character</button>
    </form>
</div>

</body>
</html>