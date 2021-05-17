package com.example.hustlerbay.chem_data

data class chapterName(var name: String)

object chaptersChem{
    val chapter = listOf(
        chapterName("Solid State") ,
        chapterName("Solution" ), chapterName("ElectroChemistry" ),
        chapterName("Chemical Kinetic") ,
        chapterName("Surface Chemistry") ,
        chapterName("Co-Ordinate Compound" ),
        chapterName("Organic(11th) - Conceptual") ,
        chapterName("Haloalkanes and Haloarenes") ,
        chapterName("Alcohols, Phenols and Ethers" ),
        chapterName("Aldehydes, Ketones, and Carboxylic Acids" ),
        chapterName("Amines")
    )
}
