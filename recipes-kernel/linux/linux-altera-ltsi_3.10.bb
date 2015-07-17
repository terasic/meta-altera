
LINUX_VERSION_SUFFIX = "-ltsi"

SRCREV ?= "${AUTOREV}"
PR = "r5"
PV = "3.10-${PR}+git${SRCREV}"

require recipes-kernel/linux/linux-altera.inc

