<!DOCTYPE html>
<html>

<head>
    <title>${pageTitle!'About'}</title>
    <link rel="stylesheet" href="/styles.css">
</head>

<body>

    <nav>
        <a href="/characters">Home</a>
        <a href="/about">About</a>
        <a href="/characters/1">Details</a>
        <a href="/characters/new">Add a Character</a>
    </nav>

    <div class="about">
        <h1>${pageTitle!'About This Website'}</h1>

        <img src="${character.imageUrl!'/goku.jpeg'}" alt="${character.name!'Goku'}" />

        <p>
            I chose dragon ball because it was a show that I grew up with and it continued to be a show that I watched
            as I got older.
            I wanted to showcase this show and the impact it has had on my life.

        </p>

    </div>

    <a href="/characters" class="back-button">Back to Gallery</a>

</body>

</html>