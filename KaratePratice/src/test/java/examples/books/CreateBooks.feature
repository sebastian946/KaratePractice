Feature: Create a post in books
  Background:
    * def generateData = Java.type('examples.utils')
    * def booksMapper = read(pathMapper + 'books.json')
    * booksMapper.title = generateData.name().title()
    * booksMapper.body =
