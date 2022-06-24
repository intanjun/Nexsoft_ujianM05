#Author: intanjuniar101@gmail.com
Feature: Add New List Activity

Scenario Outline: Create Name Activity
	Given User berada di halaman MainActivity
	When User menekan tombol add 
	And User memasukkan nama kegiatan "Piknik"
	And User memasukkan nama item1 "Jogja"
	And User memasukkan nama item2 "2106 Klaten"
	And User memasukkan nama item3 "Salatiga!"
	And User memasukkan nama item4 "2022-06-28"
	#And User hapus data baris pertama
	
	
	And User menekan tombol add2 
	And User memasukkan nama kegiatan2 "01072022"
	And User memasukkan nama item11 "Semarang"
	And User memasukkan nama item21 "2107 kediri"
	And User memasukkan nama item31 "[Salatiga]"
	And User memasukkan nama item41 "2022/06/28"
	And User hapus data baris pertama
	
	
	Then User dapat melihat new button list yang baru dibuat
	 