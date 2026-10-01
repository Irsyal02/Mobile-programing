fun main() {
	val nim = "241251086"
    
    val kodeAngkatan = nim.substring(0,2)
    val angkatan = "20$kodeAngkatan"
    
    val kodeProdi = nim.substring(2,4)
    val prodi = when  (kodeProdi){
    	"11" -> "Teknik Industri"
    	"12" -> "Teknik Mesin"
    	"13" -> "Teknik informatika"
    	else -> null
    }
    
    if (prodi != null){
    	println("$prodi Angkatan $angkatan")
    }else{
        println("Program belum mengetahui program studi tersebut")
    }
    
}
