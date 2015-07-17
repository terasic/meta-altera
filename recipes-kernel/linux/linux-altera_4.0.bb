PR = "r5"

SRCREV ?= "${AUTOREV}"
PV = "4.0-${PR}+git${SRCREV}"

require recipes-kernel/linux/linux-altera.inc

