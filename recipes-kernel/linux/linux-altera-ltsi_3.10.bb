PR = "r7"

LINUX_VERSION = "3.10"

KBRANCH = "socfpga-3.10-ltsi"

KERNEL_DEVICETREE = "socfpga_vt.dtb socfpga_cyclone5.dtb socfpga_arria5.dtb"

SRCREV ?= "${AUTOREV}"

require recipes-kernel/linux/linux-altera.inc

