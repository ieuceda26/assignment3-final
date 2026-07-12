<!DOCTYPE html>
<html>

<head>
    <title>${pageTitle!'Character Gallery'}</title>
    <link rel="stylesheet" href="/styles.css">
</head>

<body>
    <nav>
        <a href="/characters">Home</a>
        <a href="/characters/1">Details</a>
        <a href="/about">About</a>
        <a href="/characters/new">Add a Character</a>
    </nav>


    <main>
        <h1>${pageTitle!'Character Gallery'}</h1>

        <div class="gallery">
            <#list characterList as character>
                <div class="card">
                    <img src="${character.imageUrl!''}" alt="${character.name}" />
                    <div class="card-body">
                        <h2>${character.name}</h2>
                        <p>${character.universe!''}</p>
                        <p>${character.role!''}</p>
                        <p>${character.powerLevel!''}</p>
                        <a href="/characters/${character.characterId}">View Details</a>
                    </div>
                </div>
            </#list>
        </div>
    </main>

</body>

</html>