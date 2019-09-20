# Android_Sprint4Challenge_MyMovies

### Instructions

**Please read this entire README to make sure you understand what is expected of you before you begin.**

This sprint challenge is designed to ensure that you are competent with the concepts taught throughout Sprint 4.

In your solution, it is especially important that you follow best practices such as MVC and good, consistent code style. You will be scored on these aspects as well as the project MVP (minimum viable product) requirements below.

Fork this repository and clone your fork to your computer. Create your Android Studio project in this cloned fork repository folder, then commit and create a pull request. Commit appropriately as you work. When finished, push your final project to GitHub and comment on the pull requestto indicate that your project is complete.

You have *3 hours*, and you should work *independently* — looking things up (search, notes) is all fair game. And questions about *process* / *logistics* (i.e. if you have a hard time opening/saving to GitHub) are fair game too.

Good luck!

### Screen Recording

This screen recording previews the look and feel of a completed project that meets the MVP requirements for this project.

<img src="./myMoviesDemo_shorter.webm" width="300">

## Requirements

This project uses The Movie DB API. The starter project has search functionality working for you already, as that isn't the point of this Sprint Challenge. There is no need to reference the API's documentation whatsoever.

The requirements for this project are as follows:

1. A `FavoriteMovie` class. Its members will be used to store favorite movies in your Room database and allow users to add movies to their favorites and mark them as watched.

   > This will be your only local storage of movies, so you'll want to include anything you wish to  display to the user like the title

2. A `MoviesAPI` Retrofit class that implements a call to the "search/movie" endpoint.

   1. The API requires a key that is provided in the `MovieConstants` file under the val `API_KEY_PARAM`. Store this API key in SharedPreferences and retreive it when needed.

3. A Room database that can perform CRUD operations with a `FavoriteMovie` entity.

4. A `MainActivity` that allows a user to:

   1. Enter a search parameter and pass it to the `MovieAPI` "search/movie" endpoint and view a list of results.

   2. Select movies for favorites (store these in Room DB)

   3. Navigate to the favorites page

5. A `FavoritesActivity` that allows a user to:

   1. View a list of saved movies from the Room DB

   2. Mark individual movies as watched or not

   3. Remove movies from the favorites list

6. All of the background classes we've worked with this week to facilitate database interactions. 
