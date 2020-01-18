SUMMARY = "HoneyComb Package Group"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = " packagegroup-honeycomb"

RDEPENDS_packagegroup-honeycomb = " \
                                 sudo \
                                 useradd-honeycomb \
                                 net-tools \
                                 wpa-supplicant \
                                 openvpn \
                                 wget \
                                 curl \
                                 git \
                                 jq \
                                 nano \
                                 vim \
                                 ca-certificates \
                                 go \
                                 hornet \
"