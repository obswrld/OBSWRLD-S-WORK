import datetime

class Movie:
    def __init__(self, name):
        self.name = name
        self.rating = []
        self.added_time = datetime.datetime.now()

    def add_rating(self, rating):
        if 1 <= rating <= 5:
            self.rating.append(rating)
            print(f"Rating added for {self.name} : {rating}")
        else:
            print("Ratting between 1 and 5.")

    def  average_rating(self):
        if self.rating:
            return sum(self.rating) / len(self.rating)
        return 0.0


class MovieRatingSystem:
    def __init__(self):
        self.movies = {}

    def add_movie(self, name):
        if name not in self.movies:
            self.movies[name] = Movie(name)
            print(f"Movie '{name}' added.")
        else:
            print(f"Movie '{name}' already exists.")

    def rate_movie(self, name, rating):
        if name in self.movies:
            self.movies[name].add_rating(rating)
        else:
            print(f"Movie '{name}' does not exist.")

    def view_average_rating(self):
        if not self.movies:
            print("No movies added.")
            return

        print("Average ratings:")
        for movie in self.movies.values():
            avg = movie.average_rating()
            print(f"{movie.name}: {avg: .2f}")

