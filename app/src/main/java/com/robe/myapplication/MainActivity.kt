package com.robe.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.robe.myapplication.dataclasses.Data
import kotlinx.serialization.json.Json
import kotlinx.serialization.decodeFromString
import org.json.JSONObject
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private var TAG = MainActivity::class.qualifiedName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jsonDeserialize()

    }

    fun jsonDeserialize() {

        var json = """ 
           {
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
            }
            """.trimIndent()
        val dataBooks = Json.decodeFromString<Data>(json)
        for (book in dataBooks.data) {
            Log.d(TAG, book.type)
            Log.d(TAG, book.id)

            Log.d(TAG, book.attributes.title)
            Log.d(TAG, book.attributes.slug)
            Log.d(TAG, book.attributes.content)
            Log.d(TAG, book.attributes.created_at)
            Log.d(TAG, book.attributes.updated_at)

            Log.d(TAG, book.relationships.authors.links.self)
            Log.d(TAG, book.relationships.authors.links.related)

            Log.d(TAG, book.relationships.categories.links.self)
            Log.d(TAG, book.relationships.categories.links.related)

            Log.d(TAG, book.links.self)
            Log.d(TAG, book.links.related) // No tiene nada

        }
    }
}