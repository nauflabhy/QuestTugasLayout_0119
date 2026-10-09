package com.example.tugasprak4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasprak4.ui.theme.TugasPrak4Theme

@Composable
fun MahasiswaCard(
    nama: String,
    alamat: String,
    telepon: String? = null,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                horizontal = dimensionResource(R.dimen.screen_padding),
                vertical = dimensionResource(R.dimen.card_spacing)
            ),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(R.dimen.logo_size))
                    .padding(2.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = nama,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                if (telepon != null) {
                    Text(
                        text = telepon,
                        fontSize = 14.sp,
                        color = Color.White
                    )
                }
                Text(
                    text = alamat,
                    fontSize = 14.sp,
                    color = Color.Yellow
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(R.dimen.logo_size))
                    .padding(2.dp)
            )
        }
    }
}

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 40.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.title),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.subtitle),
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        MahasiswaCard(
            nama = stringResource(R.string.nama_1),
            alamat = stringResource(R.string.alamat_1),
            backgroundColor = colorResource(R.color.card_purple)
        )
        MahasiswaCard(
            nama = stringResource(R.string.nama_2),
            telepon = stringResource(R.string.telepon_2),
            alamat = stringResource(R.string.alamat_2),
            backgroundColor = colorResource(R.color.card_blue)
        )
        MahasiswaCard(
            nama = stringResource(R.string.nama_3),
            telepon = stringResource(R.string.telepon_3),
            alamat = stringResource(R.string.alamat_3),
            backgroundColor = colorResource(R.color.card_green)
        )
        MahasiswaCard(
            nama = stringResource(R.string.nama_4),
            telepon = stringResource(R.string.telepon_4),
            alamat = stringResource(R.string.alamat_4),
            backgroundColor = colorResource(R.color.card_gray)
        )

        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = stringResource(R.string.copyright),
            modifier = Modifier.padding(bottom = 30.dp)
        )
    }
}
