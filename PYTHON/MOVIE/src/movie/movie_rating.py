import datetime
from operator import index
from tkinter.font import names


class Movie:
    def __init__(self):
        self.movie_list =  []

    def add_movies(self, movie):
        current_movie = {
                                "title": movie.lower(),
                                "rating": [],
                                "date": datetime.date.today()
                                }
        self.movie_list.append(current_movie)

    def get_movies(self):
        return self.movie_list

    def get_movie(self,  movie_name):
        for each_movie in self.movie_list:
            if each_movie["title"] == movie_name.lower():
               return each_movie["title"]
        return None

def  set_rating(movie, rating, self):
    if rating < 1 or rating > 5:
        return "Invalid rating"
    for current_movie in self.movie_list:
        if current_movie["title"] == movie.lower():
            current_movie["rating"].append(rating)
    return None


def get_movie(movie):
    return movie.get_movie(movie.lower())


def average_rating(movie):
    current_movie = get_movie(movie)
    ratings = current_movie["rating"]
    if not ratings:
        return "No ratings"
    return sum(ratings) / len(ratings)

def average_of_all_ratings(movie, self):
    average = 0
    for current_movie in self.movie_list:
        one_rating = sum(current_movie["rating"])
        average += one_rating / len(current_movie["rating"])
        average /= len(current_movie["rating"])
        average = round(average, 2)
        return average
    return None





