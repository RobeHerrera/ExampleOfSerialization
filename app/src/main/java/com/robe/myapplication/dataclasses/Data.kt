package com.robe.myapplication.dataclasses

import kotlinx.serialization.Serializable

@Serializable
data class Data(
    val data: List<Books>
)
/*{
    "data": [
    {
        "type": "books",
        "id": "venganza-nuestra",
        "attributes": {
        "title": "Vengaza Nuestra",
        "slug": "venganza-nuestra",
        "content": "Narrativa sobre la postconquista de México",
        "created-at": "2021-11-06T18:41:14+00:00",
        "updated-at": "2021-11-06T18:41:14+00:00"
    },
        "relationships": {
        "authors": {
        "links": {
        "self": "https://bookstore.test/api/v1/books/venganza-nuestra/relationships/authors",
        "related": "https://bookstore.test/api/v1/books/venganza-nuestra/authors"
    }
    },
        "categories": {
        "links": {
        "self": "https://bookstore.test/api/v1/books/venganza-nuestra/relationships/categories",
        "related": "https://bookstore.test/api/v1/books/venganza-nuestra/categories"
    }
    }
    },
        "links": {
        "self": "https://bookstore.test/api/v1/books/venganza-nuestra"
    }
    }
    ]
}*/