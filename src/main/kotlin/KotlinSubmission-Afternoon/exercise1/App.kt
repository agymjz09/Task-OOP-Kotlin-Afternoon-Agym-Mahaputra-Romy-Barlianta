package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Agym"
    val lastName: String = "Mahaputra"
    val age: Int = 20
    val isSingle: Boolean = true

    println("First Name: $firstName")
    println("Last Name: $lastName")
    println("Age: $age")
    println("Single: $isSingle")
}



/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")
    return ""
}


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val teamMembers = listOf("Agym", "Rina", "Winarno", "Nofa", "Rifki", "Faqih")
    val yourName = teamMembers[0]

    return listOf(yourName)
}


/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentors = arrayOf("Pupu", "aul")
    val groupMembers = arrayOf("Agym", "Rina", "Winarno", "Nofa", "Rifki", "Faqih")

    val total = mentors.size + groupMembers.size
    return total
}


fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Frininght", listOf("Agym", "Rina", "Winarno", "Nofa", "Rifki", "Faqih"), "Afternoon")


}