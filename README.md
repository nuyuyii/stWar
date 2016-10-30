# README #

###ประกอบด้วยโปรเจค Java web Application โดยโปรแกรม Netbean 2 โปรเจค###
* MovieClient
* MovieWebService

###ต้องแก้ไข path ใน MovieWebService ที่ source packages > serverpack > mvWebService.java###
* filepath สำหรับ path ที่บันทึกเป็น xml
* xmlFile สำหรับ path ที่เป็นข้อมูลเริ่มต้น
..ถ้าต้องการให้บันทึกข้อมูลที่แก้ไขในไฟล์เริ่มต้น ให้ใช้ path เดียวกัน

###อัพเดทเชื่อมต่อโปรเจคอ###
* เริ่มจาก Mlean and Build before Deploy for MovieWebService
* จากนั้นที่ MovieClient > web service references > mvWebService > Refresh.. > check wsdl > yes
* ตามด้วย Mlean and Build before Deploy for MovieClient