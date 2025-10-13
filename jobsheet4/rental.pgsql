START
  INPUT lama_sewa (hari)
  INPUT jarak_tempuh (km)

  biaya_sewa ← lama_sewa * 300000
  biaya_supir ← lama_sewa * 200000
  biaya_bbm ← jarak_tempuh * 1000

  total_biaya ← biaya_sewa + biaya_supir + biaya_bbm

  OUTPUT "Total Biaya = ", total_biaya
END
