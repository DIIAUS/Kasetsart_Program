# วิธีติดตั้ง OS บน RaspberryPi
> ### อุปกรณ์ที่ต้องมี
> - **คอมพิวเตอร์ระบบปฎิบัติการ LINUX** (แนะนำ Ubuntu)
> - **ไฟล์ RaspberryPi_OwnOs.zip**
> - **gcc-arm-none-eabi** **[วิธีติดตั้ง gcc-arm-none](https://www.devmanuals.net/install/ubuntu/ubuntu-16-04-LTS-Xenial-Xerus/how-to-install-gcc-arm-none-eabi.html)**.
> - **RaspberryPi** (RpZeroW , Rp1 , Rp2 , Rp3 , Rp4)

## ขั้นตอนที่ 1 
> 1. ดาวน์โหลดไฟล์ RaspberryPi_OwnOs.zip
> 2. แตกไฟล์ RaspberryPi_OwnOs.zip จะได้โฟล์เดอร์ชื่อว่า --> "**circle-master**" 
> 3. เปิด **circle-master** แล้วเปิดไฟล์ ***Rules.mk***
> 4. หาคำว่า ***RASPPI	?= 1*** แล้วทำการเปลี่ยนหมายเลข RaspberryPi ที่ต้องการ **เช่น Pi4 --> RASPPI	?= 4***
> 5. 
