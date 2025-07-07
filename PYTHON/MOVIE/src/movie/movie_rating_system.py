from movie.movie_rating import Movie
from movie.movie_rating import MovieRatingSystem

def main():
    system = MovieRatingSystem()


    while True:
        print("\n1. Add movie")
        print("2. Rate movie")
        print("3. View Average Ratings")
        print("4. Exit")

        user_choice = input("Enter your choice: ")

        if user_choice == "1":
            movie_name = input("Enter movie name: ")
            system.add_movie(movie_name)
        elif user_choice == "2":
            movie_name = input("Enter movie name: ")
            rating = float(input("Enter movie rating:(1 - 5) "))
            system.rate_movie(movie_name, rating)
        elif user_choice == "3":
            system.view_average_rating()
        elif user_choice == "4":
            print("Exiting.....")
            break
        else:
            print("Invalid choice")


if __name__ == "__main__":
    main()