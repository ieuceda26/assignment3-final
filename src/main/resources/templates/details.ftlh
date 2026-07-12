<!DOCTYPE html>
<html>
<head>
    <title>Character Details</title>
    <link rel="stylesheet" href="/styles.css">
</head>
<body>

<nav>
    <a href="/characters">Home</a>
    <a href="/about">About</a>
    <a href="/new-character-form">Add a Character</a>
    <a href="/details">Details</a>
</nav>

<div class="details">
    <img src="${character.imageUrl}" alt="${character.name}">

    <div>
        <h1>${character.name}</h1>
        <p><strong>Universe:</strong> ${character.universe}</p>
        <p><strong>Role:</strong> ${character.role}</p>
        <p><strong>Species:</strong> ${character.species}</p>

        <h2>Description</h2>
        <p>
            ${character.description}
        </p>

        <h2>Abilities</h2>
        <ul>
            <li>${character.abilities!'-'}</li>
        </ul>

        <h2>First Appearance</h2>
        <p>${character.appearance!'-'}</p>
    </div>
</div>

<a href="/characters" class="back-button">Back to Gallery</a>

</body>
</html>