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
* ตามด้วย Mlean and Build before Deploy for MovieClient
* จากนั้นที่ MovieClient > web service references > mvWebService > Refresh.. > check wsdl > yes

###หน้าบริการต่างๆในเว็บ MovieClient###
* Home.jsp   - หน้าแรก แสดงรายชื่อผู้จัดทำ
* Search.jsp - หน้าค้นหารายการภาพยนตร์ จาก ชื่อภาพยนตร์, ปีที่สร้าง, ประเภท, ระยะเวลาและผู้กำกับภาพยนตร์
* Add.jsp    - หน้าเพิ่มรายการภาพยนตร์
* Delete.jsp - หน้าลบภาพยนตร์จาก ID
* Edit.jsp   - หน้าแก้ไขภาพยนตร์จาก ID

###ส่วนของการตกแต่งหน้าเว็บที่ MovieClient###
* include folder css, images, js and file styles.css
* ที่หน้าเว็บจะมี Fragments ประกอบด้วยไฟล์โค้ดที่เป็นส่วนแสดงผลของหน้าบริการต่างๆ