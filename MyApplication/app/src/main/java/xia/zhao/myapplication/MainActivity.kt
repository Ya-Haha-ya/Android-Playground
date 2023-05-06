package xia.zhao.myapplication

import android.net.Uri
import android.net.Uri.parse
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.testView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val uri: Uri = parse(
            "android.resource://" + packageName
                    + "/raw/test"
        )

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

    }
}


