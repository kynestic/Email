package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        // Sample data
        val emails = listOf(
            EmailItem(
                initial = "N",
                sender = "Netflix",
                subject = "Xem gì tiếp theo? Phim mới hot nhất tuần này",
                preview = "Khám phá các bộ phim và chương trình được yêu thích...",
                time = "3:15 PM",
                isStarred = true,
                backgroundColor = Color.parseColor("#E50914")
            ),
            EmailItem(
                initial = "P",
                sender = "PayPal",
                subject = "Xác nhận giao dịch mới nhất của bạn",
                preview = "Chi tiết giao dịch ngày 23 tháng 10, 2024...",
                time = "1:45 PM",
                isStarred = false,
                backgroundColor = Color.parseColor("#003087")
            ),
            EmailItem(
                initial = "Y",
                sender = "YouTube",
                subject = "Video mới từ kênh bạn đăng ký",
                preview = "Kênh 'Học Lập Trình' vừa đăng tải một video mới...",
                time = "11:00 AM",
                isStarred = true,
                backgroundColor = Color.parseColor("#FF0000")
            ),
            EmailItem(
                initial = "T",
                sender = "Twitter",
                subject = "Bạn có thông báo mới",
                preview = "Những cập nhật thú vị từ những người bạn theo dõi...",
                time = "10:20 AM",
                isStarred = false,
                backgroundColor = Color.parseColor("#1DA1F2")
            ),
            EmailItem(
                initial = "M",
                sender = "Medium",
                subject = "Bài viết mới dành cho bạn",
                preview = "Khám phá các bài viết phổ biến nhất tuần này...",
                time = "9:05 AM",
                isStarred = true,
                backgroundColor = Color.parseColor("#00AB6C")
            ),
            EmailItem(
                initial = "A",
                sender = "Airbnb",
                subject = "Kế hoạch du lịch tiếp theo của bạn",
                preview = "Bạn đã có ý tưởng cho kỳ nghỉ sắp tới chưa?...",
                time = "8:45 AM",
                isStarred = false,
                backgroundColor = Color.parseColor("#FF5A5F")
            ),
            EmailItem(
                initial = "B",
                sender = "Booking.com",
                subject = "Đặt phòng của bạn đã được xác nhận",
                preview = "Chuyến đi của bạn đến Đà Nẵng đã được xác nhận...",
                time = "8:20 AM",
                isStarred = true,
                backgroundColor = Color.parseColor("#003580")
            ),
            EmailItem(
                initial = "I",
                sender = "Instagram",
                subject = "Cập nhật mới từ bạn bè",
                preview = "Xem những hình ảnh mới được đăng tải...",
                time = "7:55 AM",
                isStarred = false,
                backgroundColor = Color.parseColor("#E1306C")
            ),
            EmailItem(
                initial = "Z",
                sender = "Zalora",
                subject = "Ưu đãi giảm giá 50% hôm nay",
                preview = "Nhanh tay sở hữu các món đồ thời trang với giá tốt...",
                time = "7:30 AM",
                isStarred = true,
                backgroundColor = Color.parseColor("#F58220")
            ),
            EmailItem(
                initial = "R",
                sender = "Reddit",
                subject = "Các chủ đề đang nổi trên Reddit",
                preview = "Khám phá những chủ đề hot nhất hiện nay...",
                time = "7:00 AM",
                isStarred = false,
                backgroundColor = Color.parseColor("#FF4500")
            )
        )

        listView.adapter = EmailAdapter(this, emails)
    }
}