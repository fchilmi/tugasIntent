package com.example.tugasintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testJajan = createDataJajan()
        RV.layoutManager = LinearLayoutManager(this)
        RV.setHasFixedSize(true)
        RV.adapter = adapter(testJajan, { jajanItem: data_jajan -> jajanItemClicked(jajanItem) })

    }

    private fun jajanItemClicked(jajanItem: data_jajan) {
        val showIntent = Intent(this, detail::class.java)
        showIntent.putExtra(Intent.EXTRA_TEXT, jajanItem.namaJajan.toString())
        showIntent.putExtra(Intent.EXTRA_TEMPLATE, jajanItem.descJajan.toString())
        showIntent.putExtra(Intent.EXTRA_REFERRER, jajanItem.foto.toString())
        startActivity(showIntent)
    }

    private fun createDataJajan(): List<data_jajan> {
        val partList = ArrayList<data_jajan>()
        partList.add(
            data_jajan(
                "Es Krim Zangradi",
                "Es Krim Zangradi ini berdiri sejak 1930. Es Krim ini sedikit berbeda dengan es krim pada umumnya. Teksturnya yang lebih kasar menjadi es krim ini. Tekstur kasar karena mengandung sedikit es krim pada umumnya. Es Zangradi ini cocok disantap malam hari. Es Krim Zangradi ini terletak di Jl. Yos Sudarso no 15, Surabaya. Es krim ini pun kental dengan nuansa tempo dulu. Terasa terasa nostalgia.",
                R.drawable.e_krim_zangrandi
            )
        )
        partList.add(
            data_jajan(
                "Rujak Cingur",
                "Salah satu makanan khas Surabaya yang terkenal adalah rujak cingur. Sebenarnya rujak cingur sekarang sudah tersebar di luar Surabaya. Rujak cingur ini merupakan perpaduan antara buah-buahan, sayur, dan daging. Seperti buah belimbing, bengkuang, nanas. Kemudian ditambah sayur kangkung, tauge, irisan tempe, dan tahu. Tak lupa harus menambahkan cingur sapi. Banyak tempat menjual rujak cingur terkenal di Surabaya, yaitu ",
                R.drawable.rujak
            )
        )
        partList.add(
            data_jajan(
                "Sate Klopo",
                "Sate klopo ini jangan sampai terlewat dari daftar menu wajib coba Anda. Biasanya, sate adalah daging yang ditusuk kemudian diberi bumbu kacang. Namun, sate bumbu ini adalah bumbu kacang yang ditaburi parutan kelapa kering. Sate klopo pun bisa dinikmati di malam hari yang dingin. Makanan khas surabaya malam hari ini membuat malammu semakin nikmat. Tempat sate klopo terkenal di Surabaya adalah Sate Klopo Ondomohen di Jl. Walikota Mustajab 36 Surabaya 60272 ",
                R.drawable.sate_klopo
            )
        )
        partList.add(
            data_jajan(
                "Nasi Goreng Jancuk",
                "Surabaya ini memang surga bagi para pecinta pedas. Makanan khas Surabaya kali ini adalah Nasi Goreng Jancuk. Nasi goreng ini tidak kasar kok. Hanya garang aja. Makanan inipedasnya gak karuan. Rasa pedasnya sampai ingin bilang jancuk. Satu porsi nasi goreng jancuk ini bisa disantap hingga 6 orang. Beli di Royal Plaza seharga 150 ribu rupiah. Selain itu dijual di Surabaya Suite Hotel. Di sana, pedas nasi goreng jancuk ada dua macam. Yakni pedas biasa dan ekstra pedas.",
                R.drawable.nasi_goreng_jancuk
            )
        )
        partList.add(
            data_jajan(
                "Surabaya Snowcake",
                "Oleh-oleh makanan khas Surabaya tentu sangat dinanti oleh keluarga. Salah satunya adalah Snowcake Surabaya. Oleh-oleh kekinian ini mirip seperti kue lapis. Rasanya manis. Varian rasanya pun beragam ada vanilla, choco greentea, karamel, keju, dan masih banyak lagi. Uniknya, kue salju Surabaya ini merupakan kue spikoe yang selimuti pastry. Kalau dikunyah kress dan empuk.",
                    R.drawable.surabaya_snowcake_1
            )
        )
        partList.add(
                data_jajan(
                        "Rawon Setan",
                        "Namanya terdengar seram. Seseram rasanya. Rawon setan ini sangat pedas. Para pecinta pedas tentu saja tidak boleh melewatkan makanan surabaya yang terkenal ini. Rawon setan ini dinamai demikian sebab jam bukanya pk 23.00. Belum lagi, ini juga dilengkapi dengan potongan daging sapi empuk. Tauge dan telor asin. Tempat ini terletak di Jl. Embong Malang No.78/I, In front of JW Marriott Hotel Surabaya 60261  ",
                    R.drawable.rawon_setan
                )
        )
        return partList
    }
}