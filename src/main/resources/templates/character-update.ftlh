<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>${pageTitle!'Update Character'}</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container">
    <a class="navbar-brand fw-bold" href="/characters">Dragon ball Z</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navMenu">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navMenu">
      <ul class="navbar-nav ms-auto">
        <li class="nav-item"><a class="nav-link" href="/characters">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="/characters/about">About</a></li>
        <li class="nav-item"><a class="nav-link" href="/characters/new">Add a Character</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container py-5">
  <div class="row justify-content-center">
    <div class="col-md-7">

      <div class="card shadow-sm">
        <div class="card-header bg-dark text-white">
          <h4 class="mb-0">${pageTitle!'Update Character'}</h4>
        </div>
        <div class="card-body">
          <form action="/characters/update/${character.characterId}" method="post">

            <div class="mb-3">
              <label for="name" class="form-label fw-semibold">Name</label>
              <input type="text" class="form-control" id="name" name="name"
                     value="${character.name}" required />
            </div>

            <div class="mb-3">
              <label for="universe" class="form-label fw-semibold">Universe</label>
              <input type="text" class="form-control" id="universe" name="universe"
                     value="${character.universe!''}" />
            </div>

            <div class="mb-3">
              <label for="role" class="form-label fw-semibold">Role</label>
              <input type="text" class="form-control" id="role" name="role"
                     value="${character.role!''}" />
            </div>

            <div class="mb-3">
              <label for="species" class="form-label fw-semibold">Species</label>
              <input type="text" class="form-control" id="species" name="species"
                     value="${character.species!''}" />
            </div>

            <div class="mb-3">
              <label for="imageUrl" class="form-label fw-semibold">Image URL</label>
              <input type="text" class="form-control" id="imageUrl" name="imageUrl"
                        value="${character.imageUrl!''}" placeholder="https://example.com/image.jpg or /images/character.png" />
            </div>

            <div class="mb-3">
              <label for="description" class="form-label fw-semibold">Description</label>
              <textarea class="form-control" id="description" name="description"
                        rows="4" required>${character.description}</textarea>
            </div>

            <div class="d-flex gap-2">
              <button type="submit" class="btn btn-warning fw-bold">Update Character</button>
              <a href="/characters/${character.characterId}" class="btn btn-outline-secondary">Cancel</a>
            </div>

          </form>
        </div>
      </div>

    </div>
  </div>
</div>

<footer class="text-center text-muted py-4">
  Dragon ball Z — All characters © Akira Toriyama / Toei Animation.
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
